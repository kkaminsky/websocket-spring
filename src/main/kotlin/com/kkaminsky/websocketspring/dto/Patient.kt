package com.kkaminsky.websocketspring.dto

import com.fasterxml.jackson.annotation.JsonProperty

data class Patient(
        @JsonProperty("gender")
        val gender: String,
        @JsonProperty("age")
        val age: String,
        @JsonProperty("profession")
        val profession: String,
        @JsonProperty("period in months")
        val periodInMonths: String
)