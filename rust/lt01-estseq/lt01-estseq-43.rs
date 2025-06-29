fn main() {
    let mut ana = 110;
    let mut maria = 150;
    let mut i = 0;
    while maria > ana {
        maria += 2;
        ana += 3;
        i += 1;
    }
    println!("Demorarão {} anos.", i);
}
