use std::io;

fn main() {
    //Input angulo 1
    let angulo1: f64;
    loop {
        println!("Insira o valor do primeiro ângulo:");
        let mut input = String::new();
        io::stdin().read_line(&mut input).expect("Error read_line");
        angulo1 = match input.trim().parse() {
            Ok(n) => {
                if n >= 0.0 {
                    n
                } else {
                    println!("Valor inválido!");
                    continue;
                }
            }
            Err(_) => {
                println!("Valor inválido!");
                continue;
            }
        };
        break;
    }
    //Input angulo 2
    let angulo2: f64;
    loop {
        println!("Insira o valor do segundo ângulo:");
        let mut input = String::new();
        io::stdin().read_line(&mut input).expect("Error read_line");
        angulo2 = match input.trim().parse() {
            Ok(n) => {
                if n >= 0.0 {
                    n
                } else {
                    println!("Valor inválido!");
                    continue;
                }
            }
            Err(_) => {
                println!("Valor inválido!");
                continue;
            }
        };
        break;
    }
    let angulo3: f64 = 180.0 - angulo1 - angulo2;
    if angulo3 > 0.0 {
        println!("O valor do terceiro angulo é {:.2}", angulo3);
    } else {
        println!("Isso não é um triângulo!");
    }
}
