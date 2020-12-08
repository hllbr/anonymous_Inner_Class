
public class Main {
    /*
    Anonim Inner classlarda herhangi bir class tanımlama olmadan biz bir obje oluşturabiliyoruz
    bizim bir interface yada abstract classımız varsa ve bunlardan herhangi bir class türetmeden biz direkt obje oluşturmak istiyorsak anonim Inner classları kullanıyoruz
    
    */
    public static void main(String[] args) {
        //sadece referansı objeye veriyoruz gibi düşünülebilir
        IOgrenci ogrenci = new IOgrenci() {
            @Override
            public void derscalıs() {
                System.out.println("Ders Çalışıyorum");
            }

            @Override
            public void dersegir() {
                System.out.println("Derse giriliyor....");
            }
        };//class tanımlaması gibi olduğu için bu yapu noktalı virgül ile sonlandırılması gerekiyor
        ogrenci.derscalıs();
        ogrenci.dersegir();
        System.out.println("**************************************************");
        System.out.println("//////////////////////////////////////////////////");
        
        AOgrenci ogrenci1 = new AOgrenci("@prince",58) {//isim ve numarayı girerek constructoru kuallanmış olduk 
            @Override
            void Kayıt_yaptır() {
                System.out.println("Kayıt Yapılıyor(Kayıt işlemi yapılan kişi) = "+getIsim()+"kayıt numarası = "+getNumara());
                
            }
        };
        ogrenci1.Kayıt_yaptır();
        ogrenci1.selamla();
        
        
        
        //Bu yapı en çok android programlamada kulalnılıyor
        
    }
    public static abstract class AOgrenci{//gövdeli bir metod eklediğimizi içn burayı static yapmamız gerekiyor
        private String isim ;
        private  int numara ;

        public AOgrenci(String isim, int numara) {
            this.isim = isim;
            this.numara = numara;
        }

        public String getIsim() {
            return isim;
        }

        public void setIsim(String isim) {
            this.isim = isim;
        }

        public int getNumara() {
            return numara;
        }

        public void setNumara(int numara) {
            this.numara = numara;
        }
        
        abstract void Kayıt_yaptır();
        public void selamla(){
            System.out.println("Selamlar");
        }
    }
    
    public interface IOgrenci{//Interfacelerimizide gövdeli metodlarımız olmadığı için static bir yapıya ihtiyaç yok tanımlama yaparken Method oalrak kabul edilirler ama tam anlamıyla metod değillerdir Inferfaceler
        void derscalıs();
        void dersegir();
    }
}
