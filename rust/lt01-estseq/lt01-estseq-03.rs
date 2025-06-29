use std::io;

fn main() {
    let mut base: i32;
    let mut altura: i32;
    //Input base
    loop {
        println!("Insira o valor da Base:");
        let mut input = String::new();
        io::stdin()
            .read_line(&mut input)
            .expect("Incapaz de ler alinha!");
        base = match input.trim().parse() {
            Ok(n) => n,
            Err(_) => {
                println!("Valor inválido!");
                0
            }
        };
        if base != 0 {
            break;
        }
    }
    //Inpupt Altura
    loop {
        println!("Insira o valor da Altura:");
        let mut input = String::new();
        io::stdin()
            .read_line(&mut input)
            .expect("Incapaz de ler alinha!");
        altura = match input.trim().parse() {
            Ok(n) => n,
            Err(_) => {
                println!("Valor inválido!");
                0
            }
        };
        if altura != 0 {
            break;
        }
    }
    //Calc área
    let area = (base * altura) / 2;
    println!("O valor da altura é {:.2}", area);
}
