package com.kkaminsky.websocketspring.dto

import com.fasterxml.jackson.annotation.JsonProperty


data class Message(
        @JsonProperty("patient")
        val patient: Patient
)
