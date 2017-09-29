package org.eclipse.che.examples;

public class HelloWorld {
    public static void main(String... argvs) {
                
        Node a = new Node();
        a.setPropiedad("GUA");
                
        Node b = new Node();
        b.setPropiedad("MEX");
        a.setNext(b);
                
        Node c = new Node();
        c.setPropiedad("USA");
        a.getNext().setNext(c);
        
        Node d = new Node();
        d.setPropiedad("ESP");
        a.getNext().getNext().setNext(d);
        
        System.out.println(a.getPropiedad());
        System.out.println(a.getNext().getPropiedad());
        System.out.println(a.getNext().getNext().getPropiedad());
        System.out.println(a.getNext().getNext().getNext().getPropiedad());
        
    }
    
    private static class Node{
        private  String propiedad;
        private Node next;
        
        
        private String getPropiedad(){
            return this.propiedad;
        }
        private void setPropiedad(String propieda){
          this.propiedad = propiedad;  
        }
        private Node getNext(){
            return this.next;
        }
        private void setNext(Node next){
            this.next = next;
        }
    }
}
