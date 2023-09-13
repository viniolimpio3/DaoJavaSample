/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.viniolimpio.dao;

import com.viniolimpio.dao.exception.PersistenciaException;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author 081210022
 */
public interface GenericDao<E> extends Serializable {

    List<E> listar() throws PersistenciaException;

    void inserir(E e) throws PersistenciaException;

    void alterar(E e) throws PersistenciaException;

    void remover(E e) throws PersistenciaException;

    E listarPorID(E e) throws PersistenciaException;
}
