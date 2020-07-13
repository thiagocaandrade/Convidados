package com.example.convidados.service.repository

import android.content.Context
import com.example.convidados.service.model.GuestModel

class GuestRepository(context: Context) {

    // Acesso ao banco de dados
    private val mDatabase = GuestDatabase.getDatabase(context).guestDAO()

    /**
     * Carrega convidado
     */
    fun get(id: Int): GuestModel? {
        return mDatabase.get(id)
    }

    /**
     * Insere convidado
     */
    fun save(guest: GuestModel): Boolean {
        return mDatabase.save(guest) > 0
    }

    /**
     * Faz a listagem de todos os convidados
     */
    fun getAll(): List<GuestModel> {
        return mDatabase.getInvited()
    }

    /**
     * Faz a listagem de todos os convidados presentes
     */
    fun getPresent(): List<GuestModel> {
        return mDatabase.getPresent()
    }

    /**
     * Faz a listagem de todos os convidados presentes
     */
    fun getAbsent(): List<GuestModel> {
        return mDatabase.getAbsent()
    }

    /**
     * Atualiza convidado
     */
    fun update(guest: GuestModel): Boolean {
        return mDatabase.update(guest) > 0
    }

    /**
     * Remove convidado
     */
    fun delete(guest: GuestModel) {
        return mDatabase.delete(guest)

    }

}