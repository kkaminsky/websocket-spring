package com.kkaminsky.websocketspring.controller

import com.google.gson.Gson
import com.kkaminsky.websocketspring.dto.Message
import com.kkaminsky.websocketspring.dto.OutputMessage
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.messaging.handler.annotation.MessageMapping
import org.springframework.messaging.handler.annotation.SendTo
import org.springframework.messaging.simp.SimpMessageSendingOperations
import org.springframework.stereotype.Controller
import java.text.SimpleDateFormat
import java.util.*


@Controller
class WebSocketController {


    @MessageMapping("/chat")
    @SendTo("/topic/messages")
    @Throws(Exception::class)
    fun send(message: Message): OutputMessage? {

        val a =  OutputMessage();
        a.rec1 = "Рекомендация номер 1 для людей, возвраст которых "+ message.patient.age
        a.rec2 = "Рекомендация номер 2 для людей, у которых период бессоницы состваляет "+ message.patient.periodInMonths
        a.rec3 = "Рекомендация номер 3 для людей, чья профессия "+ message.patient.profession
        return a
    }
}