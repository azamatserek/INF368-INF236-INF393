package StringBuilder;

public interface Appendable {

    void append(char c) throws Exception;
    void append(CharSequence chsq) throws Exception;
    void append(CharSequence chsq, int start, int end) throws Exception;
}
