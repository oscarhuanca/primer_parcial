package com.emergentes.modelo;


public class Registro {
   private String nombre;
   private double parcial1;
   private double parcial2;
   private double examenfinal;
   private double notafinal;
   
   public Registro (){
   }
   
   public String getNombre(){
       return nombre;
   }
   
   public void setNombre(String nombre){
       this.nombre = nombre;
   }
   public double getParcial1(){
       return parcial1;
   }
   
   public void setParcial1(double parcial1){
       this.parcial1 = parcial1;
   }
   public double getParcial2(){
       return parcial2;
   }
   
   public void setParcial2(double parcial2){
       this.parcial2 = parcial2;
   }
   public double getExamenFinal(){
       return examenfinal;
   }
   
   public void setExamenFinal(double examenfinal){
       this.examenfinal = examenfinal;
   
   }
   public double getNotaFinal(){
       return notafinal;
   }
   
   public void setNotaFinal(double notafinal){
       this.notafinal = notafinal;
   }
}
