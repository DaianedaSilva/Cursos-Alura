package com.example.bankapi

import org.springframework.data.jpa.repository.support.SimpleJpaRepository
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/accounts")
class AccountController(private val repository: AccountRepository) {

}