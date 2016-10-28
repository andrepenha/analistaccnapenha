
public class ThreadJanela extends Thread{
    
    ThreadJanela(String objeto){
        
        if(objeto == "vendas"){
            
            JfVendas vendas = new JfVendas();
            vendas.show();
            vendas.setLocationRelativeTo(null);
            
        }
        
    }

    ThreadJanela() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
