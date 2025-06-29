use std::io;

fn main() {
    //Kilos input
    let kilos: i32;
    loop {
        println!("Insia a quantidade de Kilos: ");
        let mut input = String::new();
        io::stdin().read_line(&mut input).expect("Erro read_line!");
        kilos = match input.trim().parse() {
            Ok(n) => n,
            Err(_) => {
                println!("Valor inválido!");
                continue;
            }
        };
        break;
    }
    println!("A quantidade de dias será {:.2}", (kilos * 1000) / 50);
}
