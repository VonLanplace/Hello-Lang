use std::io;

fn main() {
    let num = input_i32("Insira o numero N:");
    let mut esq: i32 = 0;
    let mut dir: i32 = 1;
    for _i in 0..num {
        let aux = esq + dir;
        esq = dir;
        dir = aux;
    }
    println!("O valor da serie fibonnaci na casa {} é {}.", num, dir);
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
