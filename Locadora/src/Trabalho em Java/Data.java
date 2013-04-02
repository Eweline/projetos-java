public final class Data{
  int dia;
  int mes;
  int ano;
  
 
public Data() {
		super();
		// TODO Auto-generated constructor stub
	}
public Data(int dia,int mes,int ano){
    setDia(dia);
    setMes(mes);
    setAno(ano);
}
    //insere dia
public void setDia(int dia){
  if(dia > 0 && dia <= 31)
     this.dia = dia;
   else {
     System.out.println ("Dia invalido. Transformado em  1." );
     this.dia = 1;
   }  
}
    //insere mes
public void setMes(int mes){
   if(mes>0 && mes<=12)
     this.mes = mes;
   else {
     System.out.println ("Mes invalido. Transformado em  1." );
     this.mes=1;
   }
}
    //insere ano
public void setAno(int ano){
   if(ano >= 1900)
     this.ano = ano;
    else {
     System.out.println ("Ano invalido. Transformado em  0." );
     this.ano = 0;
   }
} 
 public int getDia() {
    return dia;
  }
 public int getMes() {
    return mes;
  }
 public int getAno() {
    return ano;
  }
 public Data acrescentarDias(int quantidadeDias) {
	 Data aux = new Data();
	 int auxData = 3+this.dia;
	 aux.setDia(auxData%30);
	 auxData = (auxData > 30)?this.mes+1:this.mes;
	 if (auxData > 12) {
		 auxData = 1;
		 aux.setMes(auxData);
		 aux.setAno(this.ano+1);
	 } 
	 else {
		 aux.setMes(auxData);
		 aux.setAno(this.ano);
	 }
		 	 
	 return aux;
 }
 public boolean ehMenor(Data data)
	{
		if(data.ano>=this.ano && data.mes>=this.mes && data.dia>=this.dia)	return true;
		return false;
	}

 	public String toString()
 	{
 		return String.format(this.dia+"/"+this.mes+"/"+this.ano);
 	}
} // fim da classe Data

