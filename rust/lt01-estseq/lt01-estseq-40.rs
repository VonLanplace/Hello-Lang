use std::io;

fn main() {
    let num1 = input_i32("Insira um número inteiro:");
    let num2 = input_i32("Insira um número inteiro:");
    if num1 > num2 {
        primos(num1, num2);
    } else {
        primos(num2, num1);
    }
}
fn primos(maior: i32, menor: i32) {
    let mut i = menor + 1;
    while i < maior {
        if i == 2 || i == 1 {
            println!("{} é primo!", i);
        } else {
            for j in 2..i {
                if i % j == 0 {
                    println!("{} não é primo!", i);
                    break;
                } else if j == i - 1 {
                    println!("{} é primo!", i);
                    break;
                }
            }
        }
        i += 1;
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
