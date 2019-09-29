package lecture_14;

public class dyanamicqueue extends circular_queue {

    @Override
    public boolean enqueue(int item)
    {
        if (this.isFull())
        {
            int temp[]=new int[nqueue.length*2]   ;
            for (int i = 0; i <size ; i++) {
                temp[i]=nqueue[(front+i)%nqueue.length] ;
            }
            front=0;
            end=nqueue.length ;
            nqueue=temp ;
        }
        return super.enqueue(item ) ;
    }
}
