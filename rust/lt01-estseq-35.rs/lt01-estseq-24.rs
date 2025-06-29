use std::io;

fn main() {
    let valor = input_i32("Insira um valor inteiro: ");
    if valor % 3 == 0 && valor % 2 == 0 {
        println!("O {} é divisivel por 2 e 3.", valor);
    } else {
        println!("O {} não é divisivel por 2 e 3.", valor);
    }
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
