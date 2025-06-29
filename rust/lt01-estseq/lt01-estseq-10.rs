use std::io;

fn main() {
    //value 1
    let value1: f64;
    loop {
        println!("Insira um Valor Real: ");
        let mut input = String::new();
        io::stdin().read_line(&mut input).expect("Erro read_line!");
        value1 = match input.trim().parse() {
            Ok(n) => n,
            Err(_) => {
                println!("Valor Inválido");
                continue;
            }
        };
        break;
    }
    //value 2
    let value2: f64;
    loop {
        println!("Insira um Valor Real: ");
        let mut input = String::new();
        io::stdin().read_line(&mut input).expect("Erro read_line!");
        value2 = match input.trim().parse() {
            Ok(n) => n,
            Err(_) => {
                println!("Valor Inválido");
                continue;
            }
        };
        break;
    }
    //Output
    if value1 > value2 {
        println!("A diferença dos valores é {:.2}.", value1 - value2);
    } else {
        println!("A diferença dos valores é {:.2}.", value2 - value1);
    }
}
