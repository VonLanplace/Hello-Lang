use std::io;

fn main() {
    let mut hi;
    loop {
        hi = input_i32("Insira hora de inicio: ");
        if hi < 24 && hi > 0 {
            break;
        }
        println!("Valor inválido!");
    }
    let mut mi;
    loop {
        mi = input_i32("Insira minuto de inicio: ");
        if mi < 60 && mi > 0 {
            break;
        }
        println!("Valor inválido!");
    }
    let mut hf;
    loop {
        hf = input_i32("Insira hora de final: ");
        if hf < 24 && hf > 0 {
            break;
        }
        println!("Valor inválido!");
    }
    let mut mf;
    loop {
        mf = input_i32("Insira minuto de final: ");
        if mf < 60 && mf > 0 {
            break;
        }
        println!("Valor inválido!");
    }
    //calc
    mi += hi * 60;
    mf += hf * 60;
    if mi > mf {
        mf -= mi + (60 * 24);
        println!("Foram {:2.}:{:2.} de jogo.", mf / 60, mf % 60);
    } else if mi == mf {
        println!("Foram 00:00 de jogo.");
    } else {
        mf -= mi;
        println!("Foram {:2.}:{:2.} de jogo.", mf / 60, mf % 60);
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
