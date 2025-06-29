fn main() {
    for i in 1..=6 {
        for j in 1..=6 {
            if i + j == 7 {
                println!("1° Dado {} e 2° Dado {} dão {}.", i, j, i + j);
            }
        }
    }
}
