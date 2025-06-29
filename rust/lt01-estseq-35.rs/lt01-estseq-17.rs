use std::io;

fn main() {
    let tempo = input_i32("Insira o valor do tempo em segundos: ");
    let velocidade = input_i32("Insira a velociade em Km/s: ");
    let litros = (tempo * velocidade) / 12;
    println!("A quantidade de litros é {:.2}l.", litros);
}

fn input_i32(texto: &str) -> i32 {
    let int: i32;
    loop {
        println!("{}", texto);
        let mut input = String::new();
        io::stdin().read_line(&mut input).expect("Error read_line");
        int = match input.trim().parse() {
            Ok(n) => {
                if n >= 0 {
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
        return int;
    }
}
