/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package DAO;

import java.sql.SQLException;



/**
 *
 * @author Robson Rosa
 */
interface DAO {
    public boolean existe(Object obj)throws Exception; // pesquisar
    
    public void inserir(Object obj)throws Exception; 
}
