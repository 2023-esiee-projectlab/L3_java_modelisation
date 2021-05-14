/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ldumay.main;

import core.abstracts.TableModelAcces;
import fr.ldumay.others.Console;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.TableModel;
import starwars.classes.Acces;
import starwars.dao.DAOUser;

/**
 *
 * @author ldumay
 */

/**
 * Class - ViewUsersList
 * <br>
 * <br>Constructor :
 * <br>- ViewUsersList()
 * <br>
 * <br>End.
 */
public class ViewUsersList extends JFrame implements ActionListener{
    
    //-
    private String closeViewString;
    private JButton closeViewButton;
    //-
    private ArrayList<Acces> daoUserList;
    
    /**
     * Constructor
     * @throws java.sql.SQLException
     */
    public ViewUsersList() throws SQLException{
        super("Star Wars - Liste des utilisateurs");
        
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setSize(new Dimension(800, 350));
        this.setLocationRelativeTo(null);
        
        JPanel contentPanel = (JPanel) this.getContentPane();
        contentPanel.setLayout(new FlowLayout());
        
        DAOUser daoUsers = new DAOUser();
        this.daoUserList = daoUsers.listReading();
        daoUsers.close();
        
        TableModel usersTableModel = new TableModelAcces(this.daoUserList);
        JTable usersListTable = new JTable(usersTableModel);
        usersListTable.setPreferredScrollableViewportSize(new Dimension(780, 250));
        usersListTable.setFillsViewportHeight(true);
        
        JScrollPane scrollPane = new JScrollPane(usersListTable);
        contentPanel.add(scrollPane);
        
        closeViewString = "Fermer";
        closeViewButton = new JButton(closeViewString);
        closeViewButton.addActionListener(this);
        contentPanel.add(closeViewButton);
        
        this.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent event) {
        if((JButton)event.getSource() == closeViewButton){
            Console.print("[Fermeture fenêtre]");
            this.dispose();
        }
    }
    
}