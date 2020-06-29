package net.rexdev.mvvm.data.network.responses

import net.rexdev.mvvm.data.db.entities.Quote

data class QuotesResponse (
    val isSuccessful: Boolean,
    val quotes: List<Quote>
)