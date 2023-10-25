/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ViewFuncionario;


import DAO.VendaDao;
import DAO.clienteDao;
import Model.Cliente;
import Model.StockeTaxas;
import Model.Venda;
import Model.vendas;
import java.util.ArrayList;
import java.util.Calendar;

/**
 *
 * @author Pedro
 */
public class NewClass {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        VendaDao dao = new VendaDao();
        StockeTaxas taxes = new StockeTaxas();
    
        //Venda v = new Venda(taxes);
          //  dao.insert(v);
       // ArrayList<Venda> openFile = dao.openFile();
      // Cliente c1 = new Cliente();
         clienteDao aO = new clienteDao();
        // aO.insert(c1);
         VendaDao dao1 = new VendaDao();
        ArrayList<Venda> openFile = dao1.openFile();
      //  ArrayList<Cliente> openFile = aO.openFile();
            for (Venda venda : openFile) {
               if(venda.getCarro()!=null){
              System.out.println(venda.getCarro().getFabricante());
        
            }}
           
        System.out.println(openFile.size());
        
       
    }
}
