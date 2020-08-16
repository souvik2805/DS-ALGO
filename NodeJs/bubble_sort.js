process.stdin.resume();
process.stdin.setEncoding('utf-8');

let input = "";
process.stdin.on('data', function(chunk) {
  input += chunk;
});

process.stdin.on('end', function() {
  input = input.split("\n");
  let n = parseInt(input.shift()); // in order ot get no of test cases

  while(n--) {

    let size= parseInt(input.shift());

    let arr = input.shift().split(" ");

    for(let i=0; i<size; i++) {
        arr[i] = parseInt(arr[i]);
    }

    for (let i = 0; i < size - 1; i++) {
        
        let mismatch = false;
        for (let j = 0; j < size - i - 1; j++) {
            if (arr[j + 1] < arr[j]) {
                mismatch = true;
                let temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }

        if (!mismatch) {
            break;
        }        
    }

    for(let i=0; i<size; i++) {
        process.stdout.write(arr[i] + " ");
    }
    process.stdout.write('\n');
  }
    
});
