use std::io;

fn main() {
    //cateto oposto
    let oposto: f64;
    loop {
        println!("Insira o valor do cateto oposto:");
        let mut input = String::new();
        io::stdin().read_line(&mut input).expect("Error read_line");
        oposto = match input.trim().parse() {
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
    //Input adjacente
    let adjacente: f64;
    loop {
        println!("Insira o valor do cateto adjacente:");
        let mut input = String::new();
        io::stdin().read_line(&mut input).expect("Error read_line");
        adjacente = match input.trim().parse() {
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
    println!(
        "O valor da Hipotenusa é {:.2}",
        (oposto * oposto + adjacente * adjacente).sqrt()
    );
}
