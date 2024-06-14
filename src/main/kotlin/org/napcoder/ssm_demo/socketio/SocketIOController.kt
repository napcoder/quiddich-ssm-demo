package org.napcoder.ssm_demo.socketio

import com.corundumstudio.socketio.SocketIOClient
import com.corundumstudio.socketio.SocketIOServer
import com.corundumstudio.socketio.listener.ConnectListener
import com.corundumstudio.socketio.listener.DisconnectListener
import org.springframework.stereotype.Component

@Component
class SocketIOController(private val socketIOServer: SocketIOServer) {
    init {
        val listener = SocketIOListener()
        socketIOServer.addConnectListener(listener)
        socketIOServer.addDisconnectListener(listener)
    }
}

class SocketIOListener : ConnectListener, DisconnectListener {
    override fun onConnect(p0: SocketIOClient?) {
        println("connect")
    }

    override fun onDisconnect(p0: SocketIOClient?) {
        println("disconnect")
    }
}
