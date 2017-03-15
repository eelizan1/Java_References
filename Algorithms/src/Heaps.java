import java.util.Arrays;

/**
 * Created by eeliz_000 on 3/14/2017.
 * Implementation of a min heap
 */
public class Heaps {
    private int capacity = 10;
    private int size = 0;

    int[] items = new int[capacity];

    /**
     *
     * Implement help methods
     */

    // Methods to get left and right index
    private int getLeftChildIndex(int parentIndex) {
        return 2 * parentIndex + 1;
    }

    private int getRightChildIndex(int parentIndex) {
        return 2 * parentIndex + 2;
    }

    private int getParentIndex(int childIndex) {
        return (childIndex - 1) / 2;
    }

    // Methods to check if they exist
    private boolean hasLeftChild(int index) {
        return getLeftChildIndex(index) < size;
    }

    private boolean hasRightChild(int index) {
        return getRightChildIndex(index) < size;
    }

    private boolean hasParent(int index) {
        return getParentIndex(index) >= 0;
    }

    // Methods to get the values themselves
    private int leftChild(int index) {
        return items[getLeftChildIndex(index)];
    }

    private int rightChild(int index) {
        return items[getRightChildIndex(index)];
    }

    private int parent(int index) {
        return items[getParentIndex(index)];
    }

    /**
     *
     * Implmement two more methods
     */

    // swaps values and indecies
    private void swap(int indexOne, int indexTwo) {
        int temp = items[indexOne];
        items[indexOne] = items[indexTwo];
        items[indexTwo] = temp;
    }

    // Method to check if there's extra capacity
    // If full, creates a new array of double that size
    private void ensureExtraCapacity(){
        if(size == capacity) {
            items = Arrays.copyOf(items, capacity * 2);
            capacity *= 2;
        }
    }

    // Method: Peek
    // Checks if array is empty, if so, throw an exception
    // Otherwise return first element in the array
    public int peek() {
        if (size == 0)
            throw new IllegalStateException();
        return items[0]; // --> this is the root of the heap, or the most min element
    }

    //Method: Poll
    // Extracts root element and removes from array
    public int poll() {
        int item;
        if(size == 0)
            throw new IllegalStateException();
        item = items[0]; //--> puts root element in "item"
        items[0] = items[size - 1]; // --> takes last element in the array and puts it in root
        size--; //--> shrinks array
        /**
         *
         * New method to create: HeapifyDown
         */
        heapifyDown();
        return item;
    }

    // Method: Add
    // Adds an element to the tree
    public void add(int item) {
        // make sure there's capacity first
        ensureExtraCapacity();
        items[size] = item; //--> Add new element to very last spot
        size++; //--> increase size of array
        heapifyUp();
    }

    // used after adding an element
    private void heapifyUp() {
        int index = size - 1; // start with last element added
        // while there's parent item and as long as i'm out of order (parent is bigger than me)
        while(hasParent(index) && parent(index) > items[index]) {
            swap(getParentIndex(index), index); //--> swap parent with index
            index = getParentIndex(index); //--> walk upwards
        }
    }

    // to shift elements down and restructure the tree
    // For after removing a node
    private void heapifyDown() {
        int index = 0;

        // while i have , keep walking down heap
        // only need to check leftchild, because of no left child then certainly no right child
        while(hasLeftChild((index))) {
            int smallerChildIndex = getLeftChildIndex(index); //--> just initialed to the leftChild

            // check which child node is smaller
            if(hasRightChild(index) && rightChild(index) < leftChild(index)) {
                smallerChildIndex = getRightChildIndex(index);
            }

            // check if item is smaller of the smallest of the two childen
            // if yes, break
            // if not, swap
            if(items[index] < items[smallerChildIndex]) {
                break;
            } else {
                swap(index, smallerChildIndex);
            }
            index = smallerChildIndex;
        }
    }
}
