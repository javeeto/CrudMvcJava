/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloDAO;

import config.Conexion;
import interfaces.CRUD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import modelo.Persona;

/**
 *
 * @author javeeto
 */
public class PersonaDAO implements CRUD {

    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Persona p = new Persona();

    @Override
    public List listar() {
        ArrayList<Persona> list = new ArrayList();
        String sql = "select * from persona";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Persona per = new Persona();
                per.setId(rs.getInt("id"));
                per.setDni(rs.getString("dni"));
                per.setNombre(rs.getString("nombres"));
                list.add(per);
            }
        } catch (Exception e) {
            System.err.println("Error:" + e);

        }
        return list;
    }

    @Override
    public Persona list(int id) {
        ArrayList<Persona> list = new ArrayList();
        String sql = "select * from persona where id="+id;
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Persona per = new Persona();
                p.setId(rs.getInt("id"));
                p.setDni(rs.getString("dni"));
                p.setNombre(rs.getString("nombres"));
                
            }
        } catch (Exception e) {
            System.err.println("Error:" + e);

        }
        return p;
    }

    @Override
    public boolean add(Persona per) {
        String sql = "insert into persona(dni,nombres) values('" + per.getDni() + "','" + per.getNombre() + "')";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
            System.err.println("Error al insertar:" + e);

        }
        return false;
    }

    @Override
    public boolean edit(Persona per) {
        String sql = "update persona set dni='" + per.getDni() + "',nombres='" + per.getNombre() + "' where id="+per.getId();
         try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
            System.err.println("Error al actualizar:" + e);

        }
        return false;
    }

    @Override
    public boolean eliminar(int id) {
        String sql = "delete from persona where id="+id;
         try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
            System.err.println("Error al eliminar:" + e);

        }
        return false;
    }

}
