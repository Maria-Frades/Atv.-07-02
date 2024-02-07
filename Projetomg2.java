import javax.swing.JOptionPane;

public class compras{
    
    public static void main( String [] args ){
        
        String numFruta = 
           JOptionPane.showImputDialog("Escreva a qauntidade de frutas que deseja: ");
        String numVerdura = 
           JOptionPane.showImputDialog("Escreva a qauntidade de verduras que deseja: ");
        String numLegumes = 
           JOptionPane.showImputDialog("Escreva a qauntidade de legumes que deseja: ");
        
        int qFruta = Integer.parseInt(numFruta);
        int qVerdura = Integer.parseInt(numVerdura);
        int qLegumes = Integer.parseInt(numLegumes);
        
        int itens = qFruta + qVerdura + qLegumes;
        
        JOptionPane.showImputDialog(" O número tortal de intems é: " + itens, "Sendo " +qFruta, "Frutas," +qVerdura, "Verduras e" +qLegumes "Legumes.");
    }
}