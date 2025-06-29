use std::io;

fn main() {
    // read x
    println!("Insira o valor de x:");
    let mut x = String::new();
    io::stdin().read_line(&mut x).expect("Error read_line!");
    // read y
    println!("Insira o valor de y:");
    let mut y = String::new();
    io::stdin().read_line(&mut y).expect("Error read_line!");
    // switch
    let aux = x;
    x = y;
    y = aux;
    println!("x={}y={}", x, y);
}
