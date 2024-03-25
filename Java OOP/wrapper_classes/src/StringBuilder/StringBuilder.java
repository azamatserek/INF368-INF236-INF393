package StringBuilder;

public class StringBuilder implements Appendable{


    public int capacity = 16;
    int tail = 0;
    char[] string_builder;

    public StringBuilder(){
        this.string_builder = new char[this.capacity];
    }

    public StringBuilder(int capacity){
        this.capacity = capacity;
        this.string_builder = new char[this.capacity];
    }

    public StringBuilder(char word){
        this.string_builder = new char[1];
        this.string_builder[0] = word;
    }

    public char[] getStringBuilder(){
        return this.string_builder;
    }

    public void append(char c) throws Exception{
        if(this.tail > (this.capacity - 1)){
            throw new Exception("size is overflown");
        }
        this.string_builder[this.tail] = c;
        this.tail += 1;

    }
    public void append(CharSequence chsq) throws Exception{
        String chsq_to_string = chsq.toString();
        int length_of_string = chsq_to_string.length();
        if(this.tail + length_of_string > (this.capacity - 1)){
            throw new Exception("size is overflown");
        }
        for(int i = 0; i < length_of_string; i++){
            this.string_builder[this.tail] = chsq_to_string.charAt(i);
            this.tail += 1;
        }
    }

    public void append(CharSequence chsq, int start, int end) throws Exception{
        if(this.tail > (this.capacity - 1)){
            throw new Exception("size is overflown");
        }
    }



}
