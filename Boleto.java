public class Boleto extends Pagamento
{
   private String numeroDoBoleto; 
   private int dia;
   private int mes; 
   private int anoDeVencimento;
   
   public Boleto(String nomeDoPagador, String cpf, double valorASerPago, String numeroDoBoleto, int dia, int mes, int anoDeVencimento)
   {
      super(nomeDoPagador, cpf, valorASerPago);
      this.numeroDoBoleto = numeroDoBoleto;
      this.dia = dia;
      this.mes = mes;
      this.anoDeVencimento = anoDeVencimento;
   }
   
   public String getNumeroDoBoleto()
   {
      return numeroDoBoleto;
   }
   public void setNumeroDoBoleto(String numeroDoBoleto)
   {
      this.numeroDoBoleto = numeroDoBoleto;
   }
   
   public int getDia()
   {
      return dia;
   }
   public void setDia(int dia)
   {
      this.dia = dia;
   }
   
   public int getMes()
   {
      return mes;
   }
   public void setMes(int mes)
   {
      this.mes = mes;
   }
   
   public int getAnoDeVencimento()
   {
      return anoDeVencimento;
   }
   public void setAnoDeVencimento(int anoDeVencimento)
   {
      this.anoDeVencimento = anoDeVencimento;
   }
}