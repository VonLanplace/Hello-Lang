use std::io;

fn main() {
    let tipo;
    loop {
        let aux = input_i32("Insira o tipo de investimento: ");
        if aux > 0 && aux < 3 {
            tipo = aux;
            break;
        }
    }
    let valor = input_f64("insira o valor investido: ");
    if tipo > 1 {
        println!("O valor corrigido é {:.2}R$", valor * 1.05);
    } else {
        println!("O valor corrigido é {:.2}R$", valor * 1.03);
    }
}

fn input_f64(texto: &str) -> f64 {
    let double: f64;
    loop {
        println!("{}", texto);
        let mut input = String::new();
        io::stdin().read_line(&mut input).expect("Error read_line");
        double = match input.trim().parse() {
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
        return double;
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
