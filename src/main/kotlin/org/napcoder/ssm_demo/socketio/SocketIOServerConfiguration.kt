package org.napcoder.ssm_demo.socketio

import com.corundumstudio.socketio.SocketConfig
import com.corundumstudio.socketio.SocketIOServer
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import com.corundumstudio.socketio.Configuration as SocketIOConfiguration

@Configuration
class SocketIOServerConfiguration {

    @Bean
    fun socketIOServer(): SocketIOServer {
        val config: SocketIOConfiguration = SocketIOConfiguration().apply {
            hostname = "localhost"
            port = 1337
        }

        val socketConfig: SocketConfig = SocketConfig().apply {
            isReuseAddress = true
        }

        config.socketConfig = socketConfig

        return SocketIOServer(config)
    }
}