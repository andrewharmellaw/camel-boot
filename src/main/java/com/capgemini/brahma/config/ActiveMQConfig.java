package com.capgemini.brahma.config;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.activemq.camel.component.ActiveMQComponent;
import org.apache.activemq.pool.PooledConnectionFactory;
import org.apache.camel.component.jms.JmsConfiguration;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.jms.connection.JmsTransactionManager;

/**
 * Configuration class for Camel ActiveMQ component.
 *
 * @author - Santosh Singh
 */
public class ActiveMQConfig {

    private static final Logger LOGGER = LoggerFactory.getLogger(ActiveMQConfig.class);

    /**
     * Broker URL.
     */
    @Value("${activemq.broker.url:vm://localhost}")
    private String brokerURL;

    /**
     * Username for connecting to Broker.
     */
    @Value("${activemq.broker.username}")
    private String username;

    /**
     * Password for connecting to Broker.
     */
    @Value("${activemq.broker.password}")
    private String password;

    /**
     * Maximum no of pooled connections.
     */
    @Value("${activemq.connectionPool.maxConnections:10}")
    private int maxConnections;

    /**
     * Maximum no of sessions per connection.
     */
    @Value("${activemq.connectionPool.maxActiveSessionsPerConnection:10}")
    private int maxActiveSessionsPerConnection;

    /**
     * No of concurrent consumers. Each consumer uses its own session, while more than one session can use the same tcp connection.
     */
    @Value("${activemq.jms.concurrentConsumers:10}")
    private int concurrentConsumers;

    /**
     * Whether or not to use transactions.
     */
    @Value("${activemq.jms.transacted:false}")
    private boolean transacted;

    /**
     * Whether or not to use persistent delivery for message producers.
     */
    @Value("${activemq.jms.deliveryPersistent:true}")
    private boolean deliveryPersistent;

    /**
     * Whether or not the JmsConsumer process the message asynchronously. If enabled JmsConsumer may pickup the next
     * message while the previous message is being processed asynchronously.
     *
     * Note if 'transacted'=true, then 'asyncConsumer'=true does not run asynchronously, as transactions must be executed synchronously.
     */
    @Value("${activemq.jms.asyncConsumer:false}")
    private boolean asyncConsumer;

    /**
     * Cache level name for the underlying JMS resources - CACHE_AUTO, CACHE_CONNECTION, CACHE_CONSUMER, CACHE_NONE, and CACHE_SESSION.
     */
    @Value("${activemq.jms.cacheLevelName:CACHE_AUTO}")
    private String cacheLevelName;

    /**
     * JMS message acknowledge mode name - SESSION_TRANSACTED, CLIENT_ACKNOWLEDGE, AUTO_ACKNOWLEDGE, DUPS_OK_ACKNOWLEDGE
     */
    @Value("${activemq.jms.ackModeName:AUTO_ACKNOWLEDGE}")
    private String ackModeName;

    /**
     * Configure ActiveMQ connection factory.
     *
     * @return
     */
    @Bean(initMethod = "start", destroyMethod = "stop")
    public PooledConnectionFactory pooledConnectionFactory() {

        final ActiveMQConnectionFactory connFactory = new ActiveMQConnectionFactory();
        connFactory.setBrokerURL(brokerURL);
        if (StringUtils.isNotBlank(username) && StringUtils.isNotBlank(password)) {
            connFactory.setUserName(username);
            connFactory.setPassword(password);
        }
        final PooledConnectionFactory pooledConnFactory = new PooledConnectionFactory();
        pooledConnFactory.setMaxConnections(maxConnections);
        pooledConnFactory.setMaximumActiveSessionPerConnection(maxActiveSessionsPerConnection);
        pooledConnFactory.setConnectionFactory(connFactory);
        return pooledConnFactory;
    }

    /**
     * Configure Camel JMS component.
     *
     * @param pooledConnectionFactory
     * @return
     */
    @Bean
    public JmsConfiguration jmsConfiguration(final PooledConnectionFactory pooledConnectionFactory) {

        final JmsConfiguration jmsConfig = new JmsConfiguration();
        jmsConfig.setConcurrentConsumers(concurrentConsumers);
        jmsConfig.setTransacted(transacted);
        jmsConfig.setCacheLevelName(cacheLevelName);
        jmsConfig.setDeliveryPersistent(deliveryPersistent);
        jmsConfig.setAcknowledgementModeName(ackModeName);
        jmsConfig.setAsyncConsumer(asyncConsumer);
        jmsConfig.setConnectionFactory(pooledConnectionFactory);
        //Configure Spring JMS transaction manager for local transactions when the 'transacted' flag is true.
        if (transacted)
            jmsConfig.setTransactionManager(new JmsTransactionManager(pooledConnectionFactory));
        return jmsConfig;
    }

    /**
     * Configure Camel ActiveMQ component.
     *
     * @param jmsConfiguration
     * @return
     */
    @Bean(name = "activemq")
    public ActiveMQComponent activeMQComponent(final JmsConfiguration jmsConfiguration) {

        final ActiveMQComponent activeMQComponent = new ActiveMQComponent();
        activeMQComponent.setConfiguration(jmsConfiguration);
        LOGGER.info("Camel ActiveMQ component configured. Broker URL ==> {}", brokerURL);
        return activeMQComponent;
    }
}
