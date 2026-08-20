



import pyautogui 

pyautogui.PAUSE = 1  # Define uma pausa de 1 segundo entre as ações
# Exemplo de automação: Abrir o navegador e acessar um site
pyautogui.press('win')  # Pressiona a tecla Windows
pyautogui.write('edge')  # Digita 'edge' para abrir o navegador
pyautogui.press('enter')  # Pressiona Enter para abrir o navegador
pyautogui.write('www.linkedin.com/in/vitorsouza23')  # Digita o URL do site
pyautogui.press('enter')  # Pressiona Enter para acessar o site
