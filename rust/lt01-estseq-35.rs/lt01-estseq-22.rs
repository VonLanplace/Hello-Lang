use std::io;

fn main() {
    let val1: i32 = input_i32("Insira um valor inteiro: ");
    let val2: i32;
    loop {
        let aux = input_i32("Insira um valor inteiro: ");
        if val1 != aux {
            val2 = aux;
            break;
        }
        println!("Os valores devem ser diferentes!");
    }
    if val1 > val2 {
        println!("Os valores em ordem são 1°{},2°{}", val1, val2);
    } else {
        println!("Os valores em ordem são 1°{},2°{}", val2, val1);
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
