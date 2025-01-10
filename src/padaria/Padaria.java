
package padaria;


public class Padaria {

    
    public static void main(String[] args) {
        
          Login entrar = new Login();
             entrar.setVisible(true);
        
        
        DB db = new DB("padaria.db");
        db.query("SELECT * FROM padaria"); 
        
        while(db.next()) {
            int codigo = db.getInt("codigo");
            String produto = db.getString("produtos");
            String quantidade = db.getString("quantidade");
            String validade =db.getString("validade");
            
            System.out.println("codigo: "+codigo+" produtos: "+produto+" quantidade "+quantidade+" validade "+validade);
        }
        db.closeConnection();
    }
    
}
