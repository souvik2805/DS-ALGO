static Queue<Integer> ReverseK(Queue<Integer> queue, int k) { 
  
    Stack<Integer> st = new Stack<>();
    int count = k;
  
    for(int i=0; i<k; i++){
      st.push(queue.poll());
    }
    for(int i=0; i<k; i++){
      queue.offer(st.pop());
    }
    
    for(int i=0; i<queue.size()-k; i++){
        int value = queue.poll();
      queue.offer(value);
    }
        return queue;
    }
