package Oppgaver_uke6_v26_stabel_rekursjon;

public interface StabelADT<T> {


        public void push(T newEntry);

        public T pop();


        public T peek();


        public boolean isEmpty();


        public void clear();

}
