fn main() {
    let vt1 = [1, 2, 3];
    let vt2 = [4, 5, 6];
    let vt3 = [vt1, vt2].concat();
    println!("Array 1 = {:?}", vt1);
    println!("Array 2 = {:?}", vt2);
    println!("Array 3 = {:?}", vt3);
}
