package no.mesan.battleship.domain

import com.fasterxml.jackson.annotation.JsonIgnore

data class Cell(@JsonIgnore val id: Int, val shipId: Int? = null, val isHit: Boolean = false) {

    val isOccupied: Boolean
        @JsonIgnore get() = shipId != null

    fun hit() = if (isHit) this else Cell(id, shipId, true)

}