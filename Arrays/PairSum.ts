const map = new Map<number,number>();

function getPairSum(arr: number[], x: number): number{
    let result = 0;

    arr.map(num => {
        map.set(num,0);

        if(map.has(x-num)){
            console.log(x-num,num);
            result++;
        }
    })

    return result;
}

console.log(getPairSum([1, 3, 6, 2, 5, 4, 3, 2, 4],7));

//not a right solution