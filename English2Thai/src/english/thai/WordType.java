package english.thai;
class Ecat{
    String ecat;
}
public class WordType {
    public WordType(Ecat ecat){
            String[] i; 
            i = new String[23];
            String cat = ecat.ecat;
            i[0]="ADJ";
            i[1]="ADV";
            i[2]="AUX";
            i[3]="CLAS";
            i[4]="CONJ";
            i[5]="END";
            i[6]="DET";
            i[7]="INT";
            i[8]="N";
            i[9]="NEG";
            i[10]="PREP";
            i[11]="PRON";
            i[12]="QUES";
            i[13]="V";
            i[14]="ABBR";
            i[15]="ART";
            i[16]="IDM";
            i[17]="PHRV";
            i[18]="PRF";
            i[19]="SL";
            i[20]="SUF";
            i[21]="VI";
            i[22]="VT";
            
              if(cat.equals(i[0])){
                 ecat.ecat="[ คำคุณศัพท์ (Adjective) ]";
             }else if(cat.equals(i[1])){
                 ecat.ecat="[ คำกริยาวิเศษณ์ (Adverb) ]";
             }else if(cat.equals(i[2])){
                 ecat.ecat="[ คำกริยาช่วย (Auxiliary verb) ]";
             }else if(cat.equals(i[3])){
                 ecat.ecat="[ คำลักษณนาม (Classifier) ]";
             }else if(cat.equals(i[4])){
                 ecat.ecat="[ คำเชื่อม (Conjunction) ]";
             }else if(cat.equals(i[5])){
                 ecat.ecat="[ คำลงท้าย (Ending) ]";
             }else if(cat.equals(i[6])){
                 ecat.ecat="[ คำบอกกำหนด (Determiner) ]";
             }else if(cat.equals(i[7])){
                 ecat.ecat="[ คำอุทาน (Interjection) ]";
             }else if(cat.equals(i[8])){
                 ecat.ecat="[ คำนาม (Noun) ]";
             }else if(cat.equals(i[9])){
                 ecat.ecat="[ คำแสดงการปฏิเสธ (Negation) ]";
             }else if(cat.equals(i[10])){
                 ecat.ecat="[ คำบุพบท (Preposition) ]";
             }else if(cat.equals(i[11])){
                 ecat.ecat="[ คำสรรพนาม (Pronoun) ] ";
             }else if(cat.equals(i[12])){
                 ecat.ecat="[ คำแสดงการถาม (Question word) ]";
             }else if(cat.equals(i[13])){
                 ecat.ecat="[ คำกริยา (Verb) ]";
             }else if(cat.equals(i[14])){
                 ecat.ecat="[ คำย่อ (Abbreviation) ]";
             }else if(cat.equals(i[15])){
                 ecat.ecat="[ คำนำหน้านาม (Article) ]";
             }else if(cat.equals(i[16])){
                 ecat.ecat="[ สำนวน (Idiom) ]";
             }else if(cat.equals(i[17])){
                 ecat.ecat="[ กริยาวลี (Phrasal verb) ]";
             }else if(cat.equals(i[18])){
                 ecat.ecat="[ คำเติมหน้า (Prefix) ]";
             }else if(cat.equals(i[19])){
                 ecat.ecat="[ คำสแลง (Slang) ]";
             }else if(cat.equals(i[20])){
                 ecat.ecat="[ คำเติมท้าย (Suffix) ]";
             }else if(cat.equals(i[21])){
                 ecat.ecat="[ คำอกรรมกริยา (Intransitive verb) ]";
             }else if(cat.equals(i[22])){
                 ecat.ecat="[ คำสกรรมกริยา (Transitive verb) ]";
             }else{
                 ecat.ecat="[ ]";
             }  
     
    }
    
}
