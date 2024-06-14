package org.napcoder.ssm_demo.socketio

import com.corundumstudio.socketio.SocketIOServer
import org.springframework.stereotype.Component

@Component
class SocketIOServerComponent(private val socketIOServer: SocketIOServer) {
}