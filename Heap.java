public class Heap {

//the actual storage structure for your heap
private int[] arr;

//constructor for your heap
//feel free to make one that takes in an array if you prefer for your testing purposes.
//note that we will not be inserting more than 100 elements into our array so you need not worry about re-sizing
//the array
public Heap() {
    arr = new int[100];
    int size = 0;
}

//create this function to add elements to your heap
//all heap properties must be preserved
// 5 points
public void add(int toAdd) {
    int curr = size;
    arr[curr] = toAdd;
    siftUp(toAdd, curr);
    size ++;
}

//remove the largest element of the heap (the root) and re-heapafy
//5 points
public void removeMax() {
    int curr = 0;
    size --:
    arr[curr] = arr[size];
    arr[size] = 0;
    siftDown(curr);
}

//this should check and alter the tree after an item is inserted
//3 points
private void siftUp(int toAdd, int curr){
    if(arr[curr] > arr((curr-1)/2)){
        int temp = arr[(curr-1)/2];
        arr[(curr-1)/2] = arr[curr];
        arr[curr] = temp;
        add(toAdd,(curr-1)/2);
    }
}

//this should check and alter the tree after an item is deleted.
//3 points
private void siftDown(int curr) {
    if (lastIndexRight(curr)){
        if(arr[(2*curr)+2] > arr[curr]){
            int temp = arr[(2*curr)+2];
            arr[(2*curr)+2] = arr[curr];
            arr[curr] = temp;
            siftDown((2*curr)+2);
        }
    }
    else{
        if(arr[(2*curr)+1] > arr[curr]){
            int temp = arr[(2*curr)+1];
            arr[(2*curr)+1] = arr[curr];
            arr[curr] = temp;
            siftDown((2*curr)+1);
        }
    }
    return;
}

//checks to see if arr[size] is right of given index on the binary tree
private boolean lastIndexRight(int curr){

}

//4 points for syntax conventions.

 

}