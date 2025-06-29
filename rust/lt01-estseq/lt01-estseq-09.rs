use std::io;
fn main() {
    //valor 1
    let valor1: i32;
    loop {
        println!("Insira um Valor Inteiro: ");
        let mut input = String::new();
        io::stdin().read_line(&mut input).expect("Error!!");
        valor1 = match input.trim().parse() {
            Ok(n) => n,
            Err(_) => {
                println!("Valor inválido!");
                continue;
            }
        };
        break;
    }
    //valor 2
    let valor2: i32;
    loop {
        println!("Insira um Valor Inteiro: ");
        let mut input = String::new();
        io::stdin().read_line(&mut input).expect("Error!!");
        valor2 = match input.trim().parse() {
            Ok(n) => n,
            Err(_) => {
                println!("Valor inválido!");
                continue;
            }
        };
        break;
    }
    println!(
        "A soma dos quadrados é {:.2}.",
        valor1 * valor1 + valor2 * valor2
    );
}
