use std::io;

fn main() {
    let mut number;
    loop {
        println!("Insira o valor do Lado: ");
        let mut input = String::new();
        io::stdin()
            .read_line(&mut input)
            .expect("Failed to read line");

        // Keep asking until valid input
        number = match input.trim().parse() {
            Ok(n) => n,
            Err(_) => {
                println!("Invalid input. Defaulting to 0.");
                0
            }
        };
        if number != 0 {
            break;
        }
    }
    println!("A area é : {}", number * number);
}
