use std::io;

fn main() {
    let mut num1 = input_i32("Insira um valor: ");
    let mut num2 = input_i32("Insira um valor: ");

    if num1 < num2 {
        let aux = num1;
        num1 = num2;
        num2 = aux;
    }

    println!("A diferença entre os valores é {}.", num1 - num2);
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
